<template>
    <div class="father">
        <!-- menu菜单区域 -->
        <div class="menu">
            <el-radio-group v-model="isCollapse" style="background-color:#545c64">
                <el-radio-button :label="false">展开</el-radio-button>
                <el-radio-button :label="true">关闭</el-radio-button>
            </el-radio-group>
            <el-menu
                default-active="2"
                class="el-menu-vertical-demo"
                background-color="#545c64"
                text-color="#fff"
                active-text-color="#ffd04b"
                :collapse="isCollapse"
                @open="handleOpen"
                @close="handleClose"
            >
                <el-sub-menu index="1">
                    <template #title>
                        <!-- <el-icon><location /></el-icon> -->
                        <img src="static/img/other/查看.png" class="icon_img">
                        <span>&nbsp;&nbsp;&nbsp;&nbsp;查看订单</span>
                    </template>
                    <el-menu-item-group>
                        <el-menu-item index="1-1" @click="SuccessOrder">成交订单</el-menu-item>
                        <el-menu-item index="1-2" @click="Ordering">正在生效中订单</el-menu-item>
                        <el-menu-item index="1-3" @click="Fail">失败订单</el-menu-item>
                    </el-menu-item-group>
                </el-sub-menu>
                <el-menu-item index="2">
                    <img src="static/img/other/竖状图.png" class="icon_img">
                    <template #title><div @click="Bar">&nbsp;&nbsp;&nbsp;&nbsp;报表柱状图</div></template>
                </el-menu-item>
                <el-menu-item index="3">
                    <img src="static/img/other/报表 (1).png" class="icon_img">
                    <template #title><div @click="Pie">&nbsp;&nbsp;&nbsp;&nbsp;报表饼状图</div></template>
                </el-menu-item>
                <el-menu-item index="4">
                    <img src="static/img/other/报表.png" class="icon_img">
                    <template #title><div @click="Line">&nbsp;&nbsp;&nbsp;&nbsp;报表折线图</div></template>
                </el-menu-item>
                <el-menu-item index="5">
                    <img src="static/img/other/退出.png" class="icon_img">
                    <template #title><div @click="Exit">&nbsp;&nbsp;&nbsp;&nbsp;退&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;出</div></template>
                </el-menu-item>
            </el-menu>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            isCollapse: true,
        }
    },
    methods: {
        // 跳转到成功订单
        SuccessOrder () {
            this.$router.push("/admin/order");
        },
        // 正在进行订单
        Ordering () {
            this.$router.push("/admin/ordering")
        },
        // 失败订单
        Fail () {
            this.$router.push("/admin/fail")
        },
        // 报表柱状图
        Bar () {
            this.$router.push("/admin/bar")
        },
        // 报表饼状图
        Pie () {
            this.$router.push("/admin/pie")
        },
        // 报表折线图
        Line () {
            this.$router.push("/admin/line")
        },
        // 退出
        Exit () {
            localStorage.removeItem("UserData");
            this.$router.push("/loging")
        }
    }
}
</script>

<style scoped>
.father{
    width: 100%;
    height: 619px;
    display: flex;
    justify-content: space-between;
    background: #fff !important;
}
.menu {
    /* height: 100%; */
    /* width: 210px; */
    /* width: 100%; */
    background-color:#545c64;
    /* border: 1px solid red; */
}
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 200px;
  min-height: 400px;
}
.icon_img {
    height: 20px;
    width: 20px;
}
</style>