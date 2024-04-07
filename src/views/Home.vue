<template>
  <div class="home">
    <!-- 导航栏部分 -->
    <navigation></navigation>
    <!-- 轮播图部分 -->
    <banner></banner>
    <!-- 下单流程 -->
    <ordering-process></ordering-process>
    <!-- 订单模块 -->
    <order-value></order-value>
    <!-- 脚部模块 -->
    <foot></foot>
  </div>
</template>

<script>
import Navigation from '../components/navigation/navigation.vue'
import Banner from '../components/banner/banner.vue'
import OrderingProcess from '../components/order/OrderingProcess/ordering_process.vue'
import OrderValue from '../components/order/OrderOther/OrderValue.vue'
import Foot from '../components/footer/footer.vue'

export default {
  name: 'Home',
  components: {
    Navigation,
    Banner,
    OrderingProcess,
    OrderValue,
    Foot
  }
}
</script>

<style scope>
  body {
    background: #040405;
  }
</style>
