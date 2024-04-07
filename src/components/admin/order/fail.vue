<template>
    <div class="test">
        <el-table :data="tableData" stripe style="width: 100%;">
            <el-table-column prop="id" label="id" width="50" />
            <el-table-column prop="username" label="用户名称" width="180" />
            <el-table-column prop="ordernum" label="订单数量" width="100" /> 
            <el-table-column prop="price" label="成交价格" width="100" />
            <el-table-column prop="createTime" label="订单创建时间" />
            <el-table-column prop="ordered" label="订单完成时间" />
            <el-table-column prop="fairDetail" label="失败原因" />
        </el-table>
    </div>
</template>

<script>
import { adminFail } from '../../../network/http'

export default {
    data() {
        return {
            tableData: []
        }
    },
    beforeMount() {
        adminFail().then((res)=> {
            this.tableData = res
            console.log(res);
        })
    }    
}
</script>

<style scoped>

</style>