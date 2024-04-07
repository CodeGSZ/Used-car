<template>
    <div class="box">
        <!-- 右边盒子 -->
        <div class="child">
            <p>~欢迎注册~</p>
            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                <el-form-item label="用户名称" prop="name">
                    <el-input v-model="ruleForm.name" ></el-input>
                </el-form-item>
                <el-form-item label="用户密码" prop="password">
                    <el-input v-model="ruleForm.password" type="password"></el-input>
                </el-form-item>
                <el-form-item label="用户电话" prop="tel">
                    <el-input v-model="ruleForm.tel" ></el-input>
                </el-form-item>
                <el-form-item label="性&nbsp;&nbsp;&nbsp;&nbsp;别" prop="region">
                <el-select v-model="ruleForm.region" placeholder="请选择性别">
                    <el-option label="男" value="男"></el-option>
                    <el-option label="女" value="女"></el-option>
                </el-select>
                </el-form-item>
                <el-form-item label="生日时间" required>
                <el-col :span="11">
                    <el-form-item prop="date1">
                        <el-date-picker type="date" placeholder="选择生日日期" v-model="ruleForm.date1" value-format="YYYY-MM-DD" style="width: 100%;"></el-date-picker>
                    </el-form-item>
                </el-col>
                </el-form-item>
                    <el-form-item label="产品♥类型" prop="type">
                <el-checkbox-group v-model="ruleForm.type">
                    <el-checkbox label="SUV" name="type" color="white"></el-checkbox>
                    <el-checkbox label="轿跑" name="type"></el-checkbox>
                    <el-checkbox label="MPV" name="type"></el-checkbox>
                    <el-checkbox label="轿车" name="type"></el-checkbox>
                </el-checkbox-group>
                </el-form-item>
            <el-form-item>
                <!-- <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button> -->
                <!-- 加载按钮 -->
                <el-button type="primary"  @click="submitForm('ruleForm')"> 立即创建 </el-button>
                <el-button @click="resetForm('ruleForm')">重置</el-button>
            </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script>
import { addUser } from "../network/http";

  export default {
    data() {
      return {
        ruleForm: {
          name: '',
          password:'',
          tel:'',
          region: '',
          date1: '',
          delivery: false,
          type: [],
          loading:true,
        },
        rules: {
          name: [
            { required: true, message: '请输入用户名称', trigger: 'blur' },
            { min: 1, max: 11, message: '长度为11个字符', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '请输入用户密码', trigger: 'blur' },
            { min: 1, max: 11, message: '长度（>= 8）个字符', trigger: 'blur' }
          ],
          tel: [
            { required: true, message: '请输入电话', trigger: 'blur' },
            { min: 8, max: 11, message: '长度（= 11）个字符', trigger: 'blur' }
          ],
          region: [
            { required: true, message: '请选择性别', trigger: 'change' }
          ],
          date1: [
            { type: 'date', required: true, message: '请选择生日信息', trigger: 'change' }
          ],
          date2: [
            { type: 'date', required: true, message: '请选择时间', trigger: 'change' }
          ],
          type: [
            { type: 'array', required: true, message: '请至少选择一个活动性质', trigger: 'change' }
          ],
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            // 获取表单数据
            let name = this.ruleForm.name;
            let password = this.ruleForm.password; 
            let tel = this.ruleForm.tel;
            let sex = this.ruleForm.region;
            let birthday = this.ruleForm.date1;
            // 请求注册接口
            addUser(name,password,tel,sex,birthday).then((res) => {
              console.log(name,password,tel,sex,birthday)
              console.log(res)
            })    
            // 存储表单数据,转换成json对象
            // let data = {"name":this.ruleForm.name,
            //             "password": this.ruleForm.password, 
            //             "sex":this.ruleForm.region,
            //             "birthDay":this.ruleForm.date1,
            //             "type":this.ruleForm.type
            //             }
            // localStorage.setItem("User",JSON.stringify(data));
            alert('submit!');
            this.$router.push('/loging');
          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style scoped>

.box {
    height: 618px;
    width:100%;
    /* border:1px solid red; */
    background: url('../../public/static/img/other/pc1.jpg') center,center;
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center;
}
.child {
    width: 500px;
    padding: 40px;
    border-radius: 20px;
    background: rgba(227, 228, 233, 0.9);
    float: right;
    /* color: #fff; */
    text-align:center;
    margin-right: 100px;
    margin-top: 50px;
    box-shadow: 2px 1px 10px 1px rgb(74, 88, 127);
}


</style>
