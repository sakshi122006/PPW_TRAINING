/*2667*/
/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */


/*2620*/
/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    
    return function() {
        return n++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */


/*2704*/
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: function(expected) {
            if (val === expected) {
                return true;
            }
            throw new Error("Not Equal");
        },
        
        notToBe: function(expected) {
            if (val !== expected) {
                return true;
            }
            throw new Error("Equal");
        }
    };
};


/*2704*/
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: function(expected) {
            if (val === expected) {
                return true;
            }
            throw new Error("Not Equal");
        },
        
        notToBe: function(expected) {
            if (val !== expected) {
                return true;
            }
            throw new Error("Equal");
        }
    };
};
