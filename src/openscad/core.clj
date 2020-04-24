(ns openscad.core
  (:use [scad-clj.model :exclude [import use]]
        [scad-clj.scad]))

;; :nnoreamp <Leader>s :w<CR>:Require<CR>:CljEval (-main)<CR>

(def switch-height 26.5)

(def $fn 1000)

(def base
  (difference
    (cube 9 (* switch-height 2) 13)
    (translate [0 0 3]
      (cube 10 switch-height 10))))


(defn ramp-ends [piece length height leftover]
  (let [cylinder-size (- height leftover)]
    (let [cyl
          (with-fn $fn
                   (rotate [0 (deg->rad 90) 0]
                           (translate [(- (/ height 2 )) length 0]
                                      (cylinder cylinder-size cylinder-size))))]
      (difference
        piece
        cyl
        (mirror [0 1 0] cyl)))))


(def output (ramp-ends base switch-height 13 2))

(defn -main []
  (spit "output/output.scad"
        (write-scad (render output))))
