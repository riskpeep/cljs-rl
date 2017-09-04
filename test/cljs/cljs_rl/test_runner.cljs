(ns cljs-rl.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [cljs-rl.core-test]
   [cljs-rl.common-test]))

(enable-console-print!)

(doo-tests 'cljs-rl.core-test
           'cljs-rl.common-test)
