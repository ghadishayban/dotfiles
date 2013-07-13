{:user {:plugins [[lein-localrepo "0.5.2"]
                  [lein-ring "0.8.6"]
                  ;[lein-midje "2.0.4"]
]
        :dependencies [[clj-stacktrace "0.2.6"]]
        :injections [(let [orig (ns-resolve (doto 'clojure.stacktrace require)
                                            'print-cause-trace)
                           new (ns-resolve (doto 'clj-stacktrace.repl require)
                                           'pst+)]
                      (alter-var-root orig (constantly @new)))]}}
