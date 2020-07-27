(ns duct.middleware.gzip
  (:require
   [integrant.core :as ig]
   [ring.middleware.gzip :refer [wrap-gzip]]))

(defmethod ig/init-key :duct.middleware/gzip [_ _opts]
  (fn [handler]
    (wrap-gzip handler)))
