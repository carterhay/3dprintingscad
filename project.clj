(defproject openscad "0.1.0-SNAPSHOT"
  :description "A scad-clj project containing all of my 3d printing experiments and projects."
  :url "https://github.com/carterhay/3dprintingscad"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [scad-clj "0.5.3"]]
  :plugins [[lein-auto "0.1.3"]]
  :repl-options {:init-ns openscad.core}
  :main openscad.core)
