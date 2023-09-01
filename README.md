# java-repo

repository to practice java
- data-structures
- algorithms
- design patterns (gof)

# setup

gradle base multi-subprojects

```bash
sdk env
./gradlew projects -q
```
```bash
./gradlew :common:dependencies
```

`buildSrc` has the plugins where we have defined common dependencies like lombok.

