/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var array=Array();
    for(let i=0;i<arr.length;i++){
        array[i]=fn(arr[i],i);
    }
    return array;
};