const text_input=document.getElementById("text-input");
const button_input=document.getElementById("check-btn");
const result=document.getElementById("result");
function checkPalindrome(str) {
    str=str.toLowerCase();
    const reversedStr = str.split('').reverse().join('');
    return str === reversedStr;
  }


button_input.addEventListener("click",function(){
  if(text_input.value.trim()==''){
    alert("Please input a value");
  }
  else{
    const str=text_input.value.replace(/[^a-zA-Z]/g,'');
    document.getElementById("first-div").style.height="230px";
    if(checkPalindrome(str)){
      result.innerText=`${text_input.value} is a palindrome`;

    }
    else{
      result.innerText=`${text_input.value} is not a palindrome`;

    }
    }
  }
);