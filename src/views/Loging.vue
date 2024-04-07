<template>
  <div class="box">
      <!-- 右边盒子 -->
      <div class="child">
        <span @click="change1" :class="{'active':isClass}">密码登录&nbsp;&nbsp;</span>|&nbsp;
        <span @click="change2" :class="{'active':flag == false}">&nbsp;二维码登录</span>
        <div v-if="flag" class="zhanghaomima" style="margin-top:30px;margin-bottom:30px">
          <div class="input-group">
          <!-- 账号 -->
            <input type="text" v-model="UserName" class="form-control input" placeholder="手机号/昵称/邮箱">
          </div>
          <p v-if="TelError" style="margin-top:10px; font-size:10px; color:red;">账号输入错误，请检查输入格式 ！！！</p>
          <div class="input-group">
            <!-- 密码 -->
            <input v-model="password" type="password" class="form-control input" placeholder="密码">
          </div>
          <p v-if="PwdError" style="margin-top:10px; font-size:10px; color:red;">密码强度过低（密码中必须包含字母、数字 > 8） ！！！</p>
        </div>
        <div v-else class="erweima" style="margin-top:20px;">
          <img src="static/img/other/erweima.png" alt="">
        </div>
        <!-- 登录按钮 -->
        <input type="radio" style="margin-bottom:20px;" />&nbsp;&nbsp;同意 用户协议、隐私政策
        <button @click="submit" :disabled="chack" type="button" class="btn btn-danger btn-lg btn-block">登&nbsp;&nbsp;录</button>
      </div>
  </div>
</template>

<script>
import {userLogin} from "../network/http"

export default {
  name: 'Loging',
  components: {},
  data() {
    return {
      flag: true,
      isClass: true,
      num:"",
      chack: false,
      UserName: "",
      password: "",
      TelError:false,
      PwdError: false
    }
  },
  methods: {
    change1 () {
      this.flag = true;
      this.isClass = true;
    },
    change2 () {
      this.flag = false;
      this.isClass = false;
    },
    // 点击提交
    submit () {
      if (this.UserName == "") {
        this.TelError = true;
      }
      // 正则校验密码
      let pwdRegex = new RegExp('(?=.*[a-zA-Z]).{4,30}');
      if (pwdRegex.test(this.password)) {
        this.PwdError = false
      } else {
        this.PwdError = true
      }
      if (this.TelError==false && this.PwdError==false && this.UserName!="" && this.password!="") {
        // 发起请求
        userLogin(this.UserName, this.password).then((res) => {
          if (res.state == 200 && this.UserName != "admin") {
            alert ("登录成功！");
            // 将数据存储在cookie中
            localStorage.setItem("UserData", JSON.stringify(res));
            this.$router.push("/home");
          } else if (res.state == 200 && this.UserName == "admin" && res.data.identy == 0) {
            console.log(res)
            alert ("登录成功！");
            // 将用户的数据保存在cokie中
            localStorage.setItem("UserData",JSON.stringify(res));
            this.$router.push("/admin");
          } else {
            alert("用户名或密码错误！！")
          }
        })
      }
    }
  },
}
</script>

<style scoped>
.box {
    height: 618px;
    width:100%;
    /* border:1px solid red; */
    background: url('../../public/static/img/other/eqxx-pc-4.jpg') center,center;
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center;
}
.img {
  z-index: -999;
  height: 50%;
  width: 500px;
  position: relative;
  border: 1px solid black;
}
.child {
  text-align: center;
  width: 400px;
  padding: 50px;
  color: #fff;
  border-radius:20px;
  float: right;
  margin-right: 100px;
  margin-top: 100px;
  /* box-shadow: 2px 1px 10px 1px rgb(175, 173, 173); */
  box-shadow: 2px 1px 10px 1px rgb(242, 35, 63);
  /* border: 1px solid yellow; */
}
.input {
  height: 50px;
  width: 100px !important;
  margin-top: 20px;
}
.active {
  color: #DC3545;
  font-weight:bolder;
}
</style>