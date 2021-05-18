<template>
  <div id="container">
    <div>
      <h1>用户登录</h1>
    </div>
    <div id="main">
      <el-form ref="form" :model="form">
        <el-form-item>
          <el-input v-model="form.cellphone" prefix-icon="el-icon-mobile-phone" placeholder="请填写手机号码"></el-input>
        </el-form-item>
        <el-form-item>
          <el-input v-model="form.password" prefix-icon="el-icon-lock" show-password placeholder="请填写登录密码"></el-input>
        </el-form-item>
      </el-form>
    </div>
    <div>
      <el-button type="primary">主要按钮</el-button>
    </div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      form: {
        cellphone: "",
        password: ""
      }
    }
  }
}
</script>

<style scoped>
  #container {
    width: 500px;
    height: 600px;
    margin: 50px auto;
    padding: 10px 30px;
    border: 1px solid #409EFF;
    border-radius: 10px;
    box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
  }

  #main {
    margin-top: 100px;
  }
</style>
