<template>
    <div>
        <!-- 导航栏 -->
        <navigation></navigation>
        <div class="father">
            <div class="header">
                <div class="box">
                    <div class="headimg"><img src="static/img/other/head.png" style="width:70px; height:70px" alt=""></div>
                    <h5 style="margin-top:23px">欢迎 : {{ data.name }}</h5>
                    <h4 style="margin-left:300px; margin-top:23px">个人中心</h4>
                </div>     
            </div>
            <div>
                <el-card class="box-card" style="margin-top:200px; margin-left:400px">
                    <div slot="header" class="clearfix">
                        <span style="color:#40B8FF">更改个人信息</span>
                        <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
                    </div>
                    <div class="text item">
                        <el-button text @click="dialogFormVisible = true">更改账号 / 密码</el-button><br>
                        <el-button text @click="centerDialogVisible = true" style="margin-top:20px">添加收获地址</el-button>
                    </div>
                </el-card>
            </div>
        </div>
    </div>

    <!-- 更改密码弹出框 -->
    <div>
        <el-dialog v-model="dialogFormVisible" title="修改个人信息">
            <el-form :model="form">
            <el-form-item label="用户名称" :label-width="formLabelWidth">
                <el-input v-model="form.name" autocomplete="off" />
            </el-form-item>
            <el-form-item label="用户密码" :label-width="formLabelWidth">
                <input v-model="form.password" type="password" class="form-control input" placeholder="密码" style="width:300px">
            </el-form-item>
            </el-form>
            <template #footer>
            <span class="dialog-footer">
                <el-button @click="dialogFormVisible = false">取消</el-button>
                <el-button type="primary" @click="submitNP">保存</el-button>
            </span>
            </template>
        </el-dialog>
    </div>
    <!-- 添加收货地址弹出框 -->
    <div>
        <el-dialog
            v-model="centerDialogVisible"
            title="请添加地址"
            width="30%"
            destroy-on-close
            center
        >
            <span>
                请输入准确的收获地址
            </span><br>
            <textarea v-model="textarea" rows="3" cols="30"></textarea>
            <template #footer>
            <span class="dialog-footer">
                <el-button @click="centerDialogVisible = false">取消</el-button>
                <el-button type="primary" @click="submitAddress">保存</el-button>
            </span>
            </template>
        </el-dialog>
    </div>
</template>

<script>
import Navigation from '../components/navigation/navigation.vue'
import { updateNP } from '../network/http'
import { addAddress } from '../network/http'

export default {
data() {
    return {
        data:"",
        textarea: "",
        form: {
            name: '',
            password: '',
            date1: '',
            date2: '',
            delivery: false,
            type: [],
            resource: '',
            desc: '',
        },
        dialogTableVisible: false,
        dialogFormVisible: false,
        formLabelWidth: '140px',
        centerDialogVisible: false
    }
},  
components: {
    Navigation
},
mounted() {
    let Userdata = localStorage.getItem("UserData");
    // 将数据解析为json对象
    let data = JSON.parse(Userdata);
    this.data = data.data;
    this.form.name = this.data.name;
    this.form.password = this.data.password;
},
methods: {
    //点击修改账号密码
    submitNP() {
        //更改账号、密码
        updateNP(this.data.id,this.form.name, this.form.password).then((res) => {
            alert("修改成功，请重新登录！");
            localStorage.removeItem("UserData");
            this.$router.push("/loging");
        })
    },
    //点击添加地址
    submitAddress () {
        //添加地址请求
        addAddress(this.data.id, this.textarea).then((res) => {
            this.centerDialogVisible = false;
            alert("修改成功！");
        })
    }
}
}
</script>

<style scoped>
.father {
    height: 618px;
    width: 100%;
    position: absolute;
    background: #F4F5F7;
}
.header {
    height: 150px;
    width: 100%;
    /* margin-left: 80px; */
    position: absolute;
    background: rgba(78, 77, 83, 0.1);
}
.box {
    height: 70px;
    position: relative;
    /* border: 1px solid red; */
    display: flex;
    line-height: 70px;
    margin-top: 70px;
}
.headimg {
    height: 70px;
    width: 70px;
    border: 1px solid rgba(12, 1, 66, 0.2);
    margin-left: 100px;
    margin-right: 20px;
}
.text {
    font-size: 14px;
  }

.item {
margin-bottom: 18px;
}

.clearfix:before,
.clearfix:after {
display: table;
content: "";
}
.clearfix:after {
clear: both
}

.box-card {
width: 480px;
}
.el-button--text {
margin-right: 15px;
}
.el-select {
  width: 300px;
}
.el-input {
  width: 300px;
}
.dialog-footer button:first-child {
  margin-right: 10px;
}
.dialog-footer button:first-child {
margin-right: 10px;
}

</style>