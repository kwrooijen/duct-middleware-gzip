(defproject kwrooijen/duct-middleware-gzip "0.1.0"
  :description "Duct middleware for gzip"
  :url "https://github.com/kwrooijen/duct-middleware-gzip"
  :license {:name "MIT"}
  :dependencies [[amalloy/ring-gzip-middleware "0.1.4"]
                 [integrant "0.8.0"]]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :sign-releases false}]])
