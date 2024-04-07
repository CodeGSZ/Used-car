<template>
<!-- 导航栏 -->
    <navigation>
        <template v-slot:search>
            <!-- 搜索框 -->
            <div class="mt-4">
                <el-input v-model="searchContent" placeholder="Please input" class="input-with-select" style="width: 300px; margin-top:-40px;">
                    <template #append>
                        <el-button/><img src="static/img/other/search.png" style="height:20px; width:20px">
                    </template>
                </el-input>
            </div>
        </template>
    </navigation>
    <!-- 头部 -->
    <div>
        <div class="card bg-dark text-white">
            <img src="static/img/other/U1.jpg" class="card-img" alt="...">
            <div class="card-img-overlay">
                <h2 class="card-title" style="margin-top:50px">新一代GLE SUV</h2>
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to 
                                    <br>additional content. This content is a little bit longer.</p>
                <p class="card-text">Last updated 3 mins ago</p>
                <p class="card-text">实力，方可从容演绎</p>
                <button @click="Car" type="button" class="btn btn-dark" style="width:150px; margin-top:50px">了解更多</button>
            </div>
        </div>
    </div>
    <!-- 内容区域 -->
    <div>
        <div class="card-columns">
            <div class="card">
                <img @click="SelDetail(1,'SUV','新一代GLE SUV')" src="static/img/other/u2.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">新一代GLE SUV</h5>
                    <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                </div>
            </div>
            <div class="card p-3">
                <img @click="SelDetail(2,'SUV','新一代GLE轿跑SUV')" src="static/img/other/u2.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">新一代GLE轿跑SUV</h5>
                    <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                </div>
            </div>
            <div class="card">
                <img @click="SelDetail(3,'SUV','新一代梅赛德斯-AMG GLE 53 4MATIC++')" src="static/img/other/u3.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">新一代梅赛德斯-AMG GLE 53 4MATIC++</h5>
                    <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                    <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                </div>
            </div>
            <div class="card bg-primary text-white text-center p-3">
                <blockquote class="blockquote mb-0">
                <p>A well-known quote, contained in a blockquote element.</p>
                <footer class="blockquote-footer text-white">
                    <small>
                        Someone famous in <cite title="Source Title">Source Title</cite>
                    </small>
                </footer>
                </blockquote>
            </div>
            <div class="card text-center">
                <div class="card-body">
                <img @click="SelDetail(4,'SUV','新一代梅赛德斯-AMG GLE 5555 SUV')" src="static/img/other/u4.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">新一代梅赛德斯-AMG GLE 5555 SUV</h5>
                    <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                    <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                </div>
                </div>
            </div>
            <div class="card">
                <img @click="SelDetail(5,'SUV','全新奔驰ES6500')" src="static/img/other/u5.jpg" class="card-img" alt="...">
            </div>
            <div class="card p-3 text-right">
                <blockquote class="blockquote mb-0">
                <p>全新奔驰ES6500</p>
                <footer class="blockquote-footer">
                    <small class="text-muted">
                    Someone famous in <cite title="Source Title">Source Title</cite>
                    </small>
                </footer>
                </blockquote>
            </div>
            <div class="card">
                <div class="card-body">
                <img @click="SelDetail(6,'SUV','新一代梅赛德斯奔驰 4MATIC++')" src="static/img/other/u6.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">新一代梅赛德斯奔驰 4MATIC++</h5>
                    <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                    <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 脚部 -->
    <foot></foot>
</template>

<script>
import Navigation from '../navigation/navigation.vue'
import foot from '../footer/footer.vue'

export default {
    data() {
        return {
            
        }
    },
    components: {
        Navigation,
        foot
    },
    methods: {
        SelDetail (id,car,value) {
            this.$router.push({name:"CarDetail",params:{id:id, type:car, name:value}})
        }
    }
}
</script>

<style scoped>

</style>