<template>
    <div class="box">
        <div class="child">
            <div class="child1">
                <div class="header">
                    <span @click="change1" :class="{'active':isClass}">尊享一站式服务</span>
                    <span @click="change2" :class="{'active':flag == false}">下单流程</span>
                </div>
                <div v-if="flag" class="content">
                    <div><img src="static/img/other/icon_尊享_一键查.png" alt=""><p>真实库存 一键查询</p></div>
                    <div><img src="static/img/other/icon_尊享_专享礼遇.png" alt=""><p>线上下单 专享礼遇</p></div>
                    <div><img src="static/img/other/icon_尊享_小额定金.png" alt=""><p>小额定金 随时可退</p></div>
                    <div><img src="static/img/other/icon_尊享_热门车源.png" alt=""><p>热门车源 提前锁定</p></div>
                    <div><img src="static/img/other/icon_尊享_省时省心.png" alt=""><p>在线选车 省时省心</p></div>
                </div>
                <div v-else class="content">
                    <div><img src="static/img/other/icon_下单_开票.png" alt=""><p>车辆开票</p></div>
                    <div><img src="static/img/other/icon_下单_支付意向金.png" alt=""><p>支付意向金</p></div>
                    <div><img src="static/img/other/icon_下单_确认签约.png" alt=""><p>点击“确认已签约”</p></div>
                    <div><img src="static/img/other/icon_下单_经销商.png" alt=""><p>去经销商签约</p></div>
                    <div><img src="static/img/other/icon_下单_获得礼品.png" alt=""><p>获得礼品</p></div>
                </div>
                <div class="foot">
                    <h5>意向金支付与退款</h5>
                    意向金仅代表您的初步购买意向，不具有担保性质。支付完成后，所选定配置的车辆将为您优先预留48小时，请在此期间联系您所选择的经销商。意向金将支付至您所选择经销商的【银联商务】托管账户。如需申请退款，请在支付后点击“申请退款”，意向金将于5-10个工作日全额原路退回您的账户。
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "order_process",
    data() {
        return {
            flag: true,
            isClass:true,
        }
    },
    methods: {
        change1 () {
            this.isClass = true;
            this.flag = true;
        },
        change2 () {
            this.flag = false;
            this.isClass = false;
        }
    }
}
</script>

<style scoped>
.box {
    height: 560px;
    width:100%;
    background: url('../../../../public/static/img/other/1.jpg') center,center;
    background-repeat: no-repeat;
    background-size: contain;
    background-position: center;
}
.child {
    height: 560px;
    width:100%;
    position: absolute;
    background: rgba(4, 4, 5 ,0.8);
}
.child1 {
    height: 400px;
    width: 1077px;
    position: relative;
    margin: 0 auto;
    margin-top: 159px;
    border-radius: 10px 10px 0px 0px;
    border: 1px solid #5F5D5C;
    border-bottom: none;
}
.header span {
    font-size: 30px;
    color: #FFFFFF;
    padding: 30px;
    border-bottom: 1px solid #5F5D5C;
}
.header {
    width: 600px;
    height: 80px;
    text-align: center;
    line-height: 80px;
    margin: 0 auto;
}
.active {
    border-bottom: 4px solid #fff !important;
}
.content {
    width: 800px;
    height: 80px;
    margin: 0 auto;
    display: flex;
    color: #fff;
    justify-content: space-around;
    margin-top: 40px;
    margin-bottom: 50px;
    /* border: 1px solid red; */
}
.content div {
    text-align: center;
}
.foot {
    width: 600px;
    height: 80px;
    color: #fff;
    margin: 0 auto; 
}
img {
    height: 50px;
    width: 50px;
}
</style>