/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    let obj={
        toBe:function(val1){
            if(val===val1){
                return true
            }
            else{
                throw "Not Equal"
            }
        },
        notToBe:function(val2){
            if(val!==val2){
                return true
            }
            else{
                throw "Equal"
            }
        }
    }
    return obj;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */