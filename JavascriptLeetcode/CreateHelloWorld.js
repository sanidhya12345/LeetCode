/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return hello=(...args)=>{
       return "Hello World";
    }
};
/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */