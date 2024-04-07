<template>
    <div class="father">
        <!-- 导航栏 -->
        <navigation></navigation>
        <div class="header">
            <p style="float:left; margin-left:20px; color:#CA141D; font-size:15px">亲爱的顾客您好：由于商品原因，请加入购物车后及时下单，以免各种原因导致您无法购买到自己心仪的物品！！！</p>
        </div>

        <div class="content" v-for="(items, index) in goods" :key="index">
            <!-- 图片 -->
            <div style="float:left; margin-right:20px">
                <el-image style="width: 162px; height: 162px" src="" />
            </div>
            
            <div>
                <el-descriptions title="" size="large" column="1">
                    <el-descriptions-item size="large" label="租定车辆名称">{{ items.carName }}</el-descriptions-item>
                    <el-descriptions-item label="租售价格(/辆)">{{ items.price }}</el-descriptions-item>
                    <el-descriptions-item label="车辆颜色">{{ items.color }}</el-descriptions-item>
                    <el-descriptions-item label="发动机类型">{{ items.carDetail.enginType }}</el-descriptions-item>
                </el-descriptions>
            </div>
            <!-- 价格显示标签 -->
            <div style="margin-left: 20px; width:500px;">
                <el-text tag="b"><span style="color:red">￥{{ price }}.00</span></el-text>
            </div>
            <!-- 购买删除按钮 -->
            <div style="width:500px;float:right;">
                <el-input-number v-model="num" :min="1" :max="10" @change="handleChange(index)" />&nbsp;&nbsp;&nbsp;&nbsp;
                <button @click="del(index)" type="button"  class="btn btn-info">点击删除</button>&nbsp;&nbsp;&nbsp;&nbsp;
                <button type="button" class="btn btn-danger">
                    <el-button text @click="dialogTableVisible = true" style="height:10px; color:#fff">
                        立即下单
                    </el-button>
                </button>
            </div>
        </div>

        
        <!-- 弹出地址对话框 -->
        <el-dialog v-model="dialogTableVisible" title="请核对个人信息（收货地址、联系人、商品数量）">
            {{ this.goods }}
            <div style="margin-top:20px">
                <el-button @click="dialogTableVisible = false">取消</el-button>
                <el-button type="primary" @click="submit">提交订单</el-button>
            </div>
        </el-dialog>
    </div>
</template>

<script>
import Navigation from '../components/navigation/navigation.vue'
import {addShopping} from '../network/http'

export default {
    data() {
        return {
            num:1,
            price: "",
            dialogTableVisible: false,
            gridData: "",
            goods: "",
        }
    },
    components: {
        Navigation
    },
    methods: {
        handleChange (index) {
            this.price = this.goods[index].price * this.num;
        },
        del (value) {
            // console.log(this.ByList[0])
            // console.log(value)
            alert("您确定要删除吗？")
            this.goods.splice(value,1)
            alert("删除成功！！！！")
        },
        submit () {
            alert("提交成功 ！！！！");
            let userdata = localStorage.getItem("UserData");
            // 将数据解析为json对象
            let username = JSON.parse(userdata);
            //添件购物车网络请求
            addShopping(username.data.id, this.num).then((res) => {
                console.log(res);
                alert("下单成功！");
                this.$router.push("/personal");
            })

        }
    },
    mounted() {
        let Bydata = localStorage.getItem("Bydata");
        // 将数据解析为json对象
        let DATA = JSON.parse(Bydata);
        console.log(DATA)
        this.goods = DATA;
    },
}
</script>

<style scoped>
.body {
    background: #F5F5F5;
}
.father {
    background: #F5F5F5;
    height: 618px;
}
.head {
    height: 50px;
    width: 100%;
}
.img {
    height: 50px;
    width: 200px;
    float: left;
}
.header {
    height: 50px;
    width: 100%;
    margin-top: 55px;
    line-height: 50px;
    background: #FFFDEE;
    border: 1px solid #EACE85;
}
.content{
    height: 185px;
    width: 100%;
    margin-top: 20px;
    line-height: 162px;
    background: #FFFFFF;
    display: flex;
}
</style>