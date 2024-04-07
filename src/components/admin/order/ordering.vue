<template>
    <div class="test">
        <el-table :data="tableData" stripe style="width: 100%;">
            <el-table-column prop="id" label="id" width="50" />
            <el-table-column prop="name" label="用户名称" width="180" />
            <el-table-column prop="tel" label="用户电话" width="180" /> 
            <el-table-column prop="orderNum" label="订单数量" width="100" />
            <el-table-column prop="address" label="收货地址" />
            <el-table-column prop="sex" label="性别" width="100" />
            <el-table-column prop="createTime" label="下单时间" />
        </el-table>
    </div>
</template>

<script>
import { adminOdering } from '../../../network/http'

export default {
    data() {
        return {
            tableData: []
        }
    },
    beforeMount() {
        adminOdering().then((res)=> {
            this.tableData = res
            console.log(res);
        })
    }
}
</script>

<style scoped>

</style>