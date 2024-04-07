<template>
    <div>
        <!-- 导航栏 -->
        <navigation></navigation>
        <!-- 车辆数据表单 -->
        <div class="carDetail">
            <ul class="list-group list-group-horizontal">
                <li class="list-group-item" style="width:200px">车辆名称 :</li>
                <li class="list-group-item" style="width:300px; color: red">{{ data.carName }}</li>
                <li class="list-group-item" style="width:200px">车辆颜色 :</li>
                <li class="list-group-item" style="width:300px; color: red">{{ data.color }}</li>
            </ul>
            <ul class="list-group list-group-horizontal-sm">
                <li class="list-group-item" style="width:200px">库存数量 ：</li>
                <li class="list-group-item" style="width:300px; color: red">{{ data.num }}</li>
                <li class="list-group-item" style="width:200px">出租价格 ：</li>
                <li class="list-group-item" style="width:300px; color: red">￥{{ data.price }}</li>
            </ul>
            <ul class="list-group list-group-horizontal-md">
                <li class="list-group-item" style="width:200px">产品类型 ：</li>
                <li class="list-group-item" style="width:300px">{{ data.carInformation }}</li>
                <li class="list-group-item" style="width:200px">总重量 （KG） :</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.allowKG }} kg</li>
            </ul>
            <ul class="list-group list-group-horizontal-lg">
                <li class="list-group-item" style="width:200px">发动机类型 ：</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.enginType }}</li>
                <li class="list-group-item" style="width:200px">是 / 否装备LED灯</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_LED}}</li>
            </ul>
            <ul class="list-group list-group-horizontal-xl">
                <li class="list-group-item" style="width:200px">是 / 否装备电动尾门</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_diandongwei}}</li>
                <li class="list-group-item" style="width:200px">是 / 否装备隔热玻璃</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_gereboli}}</li>
            </ul>
            <ul class="list-group list-group-horizontal-xl">
                <li class="list-group-item" style="width:200px">是 / 否装备安全气囊</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_qilang}}</li>
                <li class="list-group-item" style="width:200px">是 / 否可以检测胎压</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_taiya}}</li>
                <el-button type="primary" @click="shopping" style="margin-left:100px" round>立即租购</el-button>
            </ul>
            <ul class="list-group list-group-horizontal-xl">
                <li class="list-group-item" style="width:200px">是 / 否装备尾灯</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_weideng}}</li>
                <li class="list-group-item" style="width:200px">是 / 否可以识别语音</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_yuying}}</li>
            </ul>
            <ul class="list-group list-group-horizontal-xl">
                <li class="list-group-item" style="width:200px">是 / 否装备智能钥匙</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.equip_zhinengyaoshi}}</li>
                <li class="list-group-item" style="width:200px">离地间隙</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.jianximm}}</li>
            </ul>
            <ul class="list-group list-group-horizontal-xl">
                <li class="list-group-item" style="width:200px">喷油量 ：</li>
                <li class="list-group-item" style="width:300px; color:red;">{{ data.carDetail.l}}</li>
                <li class="list-group-item" style="width:200px">最高速度</li>
                <li class="list-group-item" style="width:300px; color:red;">{{ data.carDetail.mostSpead}} km/m /h</li>
            </ul>
            <ul class="list-group list-group-horizontal-xl">
                <li class="list-group-item" style="width:200px">油箱含量 ：</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.oil}}</li>
                <li class="list-group-item" style="width:200px">百公里加速度</li>
                <li class="list-group-item" style="width:300px; color:red;">{{ data.carDetail.speadTime}} km/m</li>
            </ul>
            <ul class="list-group list-group-horizontal-xl">
                <li class="list-group-item" style="width:200px">整备质量 ：</li>
                <li class="list-group-item" style="width:300px">{{ data.carDetail.zhengKG}} kg</li>
                <li class="list-group-item" style="width:200px">车辆轴距 </li>
                <li class="list-group-item" style="width:300px;">{{ data.carDetail.zhouMM}} mm</li>
            </ul>
        </div>
    </div>
</template>

<script>
import Navigation from '../components/navigation/navigation.vue'
import {CarDetail} from "../network/http"
let BuydetailData = [];
export default {
    data() {
        return {
            id: "",
            carType:"",
            CarName:"",
            data:"",
            ByDetai:""
        }
    },
    components: {
        Navigation
    },
    beforeMount() {
        this.id = this.$route.params.id,
        this.carType = this.$route.params.type,
        this.CarName = this.$route.params.name
        //发起网络请求       
        CarDetail(this.id).then((res) => {
            this.data = res.data;
            this.ByDetai = res.data;
            console.log(res)
        })
    },
    mounted() {
        

    },
    methods: {
        shopping() {
            BuydetailData.push(this.ByDetai);
            console.log(JSON.stringify(BuydetailData))
            localStorage.setItem("Bydata", JSON.stringify(BuydetailData));
            this.$router.push("/shopping");
        }
    },
}
</script>

<style scoped>
.carDetail {
    width: 100%;
    height: 600px;
    margin-top: 50px;
    text-align: center;
    background: white;
}
a {
    display: inline !important;
    width: 50%;
    border: 1px solid red;
}
.list-group {
    margin-top: 5px;
}
</style>