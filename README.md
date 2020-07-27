# Duct middleware Gzip

[![Clojars Project](https://img.shields.io/clojars/v/duct-middleware-gzip.svg)](https://clojars.org/kwrooijen/duct-middleware-gzip)

## Usage

`project.clj`

```clojure
:dependencies [[kwrooijen/duct-middleware-gzip "0.1.0"]]
```

`config.edn`

```clojure
{:duct.profile/base
 {:duct.handler/root
  {:middleware
   ^:prepend
   [#ig/ref :duct.middleware/gzip]}}}
```

## Author / License

Released under the [MIT License] by [Kevin William van Rooijen].

[Kevin William van Rooijen]: https://twitter.com/kwrooijen

[MIT License]: https://github.com/kwrooijen/gungnir/blob/master/LICENSE
