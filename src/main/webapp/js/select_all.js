/**
 * Created by Administrator on 27/11/2017.
 */

$(function () {

    var  selectALlDom =  $("#selectAll");
    var inputDom = $("#table").find("input[type='checkbox']");

    selectALlDom.unbind("click");
    selectALlDom.bind("click",function () {

            if (this.checked){
                inputDom.attr("checked",true);
            }else{
                inputDom.attr("checked",false);
            }
    });

});