<template>
    <div>
        <div class="fixed-top">
            <div class="collapse" id="navbarToggleExternalContent">
                <div class="bg-dark p-4">
                    <h5 class="text-white h4">Well Come To Car Rental System</h5>
                    <img src="static/img/logo/logo.png" alt="" style="height:100px; width:100px;">
                    <span class="text-muted">欢迎来到汽车租赁系统</span>
                    <span class="text-muted" style="margin-left:100px">汽车管家竭诚为您服务~~~</span>
                </div>
            </div>
            <nav class="navbar navbar-dark bg-dark">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                </button>
                <div class="header">
                    <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
                        <li class="nav-item" role="presentation">
                            <button @click="pageHome" class="nav-link active" id="pills-home-tab" data-toggle="pill" data-target="#pills-home" type="button" role="tab" aria-controls="pills-home" aria-selected="true">首页</button>
                        </li>
                        <li class="nav-item" role="presentation">
                            <button @click="pageCar" class="nav-link" id="pills-profile-tab" data-toggle="pill" data-target="#pills-profile" type="button" role="tab" aria-controls="pills-profile" aria-selected="false">轿车</button>
                        </li>
                        <li class="nav-item" role="presentation">
                            <button @click="pageSuv" class="nav-link" id="pills-contact-tab" data-toggle="pill" data-target="#pills-contact" type="button" role="tab" aria-controls="pills-contact" aria-selected="false">SUV</button>
                        </li>
                        <li class="nav-item" role="presentation">
                            <button @click="pageRun" class="nav-link" id="pills-contact-tab" data-toggle="pill" data-target="#pills-contact" type="button" role="tab" aria-controls="pills-contact" aria-selected="false">跑车</button>
                        </li>
                    </ul>
                </div>
                <!-- 具名插槽 -->
                <div class="solt">
                    <slot name="search"></slot>
                </div>
                <div v-if="flag" class="loging">
                    <button @click="Loging" type="button" class="btn btn-secondary" style="margin-right:20px">登录</button>
                    <button @click="Adding" type="button" class="btn btn-secondary">注册</button>
                </div>
                <div v-else class="loging" style="color:white">
                    <!-- <span>欢迎：{{ name }}</span> -->
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary">{{ name }}</button>
                        <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-expanded="false">
                            <span class="sr-only">Toggle Dropdown</span>
                        </button>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" @click="personal">个人中心</a>
                            <a class="dropdown-item" @click="shopping">购物车</a>
                            <a class="dropdown-item" @click="exit">退出</a>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</template>

<script>
export default {
    name: 'navigation',
    data() {
        return {
            flag: true,
            name: "",
        }
    },
    methods: {
        Loging () {
            this.$router.push("/loging");
        },
        Adding () {
            this.$router.push("/adduser");
        },
        pageHome () {
            this.$router.push("/");
        },
        pageCar () {
            this.$router.push("/car");
        },
        pageSuv () {
            this.$router.push("/suv");
        },
        pageRun () {
            this.$router.push("/run");
        },
        personal () {
            this.$router.push("/personal");
        },
        shopping () {
            this.$router.push("/shopping")
        },
        exit() {
            alert("欢迎下次光临~~");
            localStorage.removeItem("UserData");
            this.$router.push("/loging");
        }
    },
    mounted () {
        if(localStorage.getItem("UserData") != null) {
            this.flag = false;
            let Userdata = localStorage.getItem("UserData");
            // 将数据解析为json对象
            let data = JSON.parse(Userdata);
            this.name = data.data.name
        }
    }
}
</script>

<style scoped>
.header {
    /* border: 1px solid red; */
    height: 40px;
    margin: 0 auto;
    margin-left: 50px;
    color: white;
    width:600px;
}
.nav-item {
    margin-right: 50px;
}
.nav-item button{
    color: white;
}
.solt {
    height: 40px;
    width: 300px;
    margin-left: 600px;
    position: absolute;
    margin-right:200px;
    /* border: 1px solid red; */
}
</style>
