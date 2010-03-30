(ns pallet.resource.test-resource
  (:require [clojure.contrib.str-utils2 :as string])
  (:use
   [pallet.target :only [admin-group *target-tag* *target-template*]]
   [pallet.stevedore :only [script]]
   [pallet.template]
   [pallet.resource :only [defresource defcomponent]]
   [pallet.resource.user :only [user-home]]
   [clojure.contrib.logging]))

(def test-resource-args (atom []))

(defn- apply-test-resources [args]
  (str "test-resource:" *target-tag* *target-template*))

(defresource test-resource
  test-resource-args apply-test-resources [])

(defn- test-component-fn [arg]
  (str arg))

(defcomponent test-component
  test-component-fn [arg])
