<!-- eslint-disable -->
<template>
  <div class="container">
    <h2>员工信息列表</h2>

    <!-- 使用原生 HTML 表格，避开 Element Plus 的渲染 Bug -->
    <table class="emp-table" v-if="empList.length > 0">
      <thead>
      <tr>
        <th>员工编号</th>
        <th>工号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>身份证号</th>
        <th>手机号</th>
        <th>邮箱</th>
        <th>基本工资</th>
        <th>民族</th>
      </tr>
      </thead>
      <tbody>
      <!-- 循环渲染数据 -->
      <tr v-for="(emp, index) in empList" :key="emp.id || index">
        <td>{{ emp.id }}</td>
        <td>{{ emp.empNo }}</td>
        <td>{{ emp.empName }}</td>
        <td>{{ emp.gender }}</td>
        <td>{{ emp.idCard }}</td>
        <td>{{ emp.phone }}</td>
        <td>{{ emp.email }}</td>
        <td>{{ emp.salary }}</td>
        <td>{{ emp.nation }}</td>
      </tr>
      </tbody>
    </table>

    <!-- 数据没来时的提示 -->
    <div v-else style="text-align: center; margin: 20px; color: #999;">
      正在加载员工数据...
    </div>

    <div style="margin-top: 20px;">
      <div>姓名：刘战</div>
      <div>学号：23013210025</div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

// 定义响应式数组
const empList = ref([])

// 获取后端接口数据
function loadEmpData() {
  axios.get('http://localhost:8080/api/emp/list')
      .then(res => {
        empList.value = res.data
        console.log("获取成功:", empList.value)
      })
      .catch(err => {
        console.error("请求失败，请检查后端是否启动", err)
      })
}

onMounted(() => {
  loadEmpData()
})
</script>

<style scoped>
.container {
  padding: 20px;
}

/* 给原生表格加点好看的样式，代替 Element Plus */
.emp-table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 10px;
  text-align: center;
  font-size: 14px;
}

.emp-table th, .emp-table td {
  border: 1px solid #dcdfe6;
  padding: 12px 8px;
}

.emp-table th {
  background-color: #f5f7fa;
  color: #333;
  font-weight: bold;
}

/* 斑马纹效果 */
.emp-table tbody tr:nth-child(even) {
  background-color: #fafafa;
}

/* 鼠标悬停高亮 */
.emp-table tbody tr:hover {
  background-color: #f0f9eb;
}
</style>