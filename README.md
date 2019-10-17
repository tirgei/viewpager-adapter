# Preferences Helper

[![](https://jitpack.io/v/tirgei/viewpager-adapter.svg)](https://jitpack.io/#tirgei/viewpager-adapter)
[![BCH compliance](https://bettercodehub.com/edge/badge/tirgei/viewpager-adapter?branch=master)](https://bettercodehub.com/)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/22668aca7ac142b182a1565e99bfec98)](https://www.codacy.com/manual/tirgei/viewpager-adapter?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=tirgei/viewpager-adapter&amp;utm_campaign=Badge_Grade)

An android library to implement a dynamic view pager adapter

### Download
You can add the library to your project via gradle

Step 1: Add in your root build.gradle of your project
```
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
```

Step 2: Add the dependency to your app gradle
```

    dependencies {
    	...
	implementation 'com.github.tirgei:viewpager-adapter:{latest-release}'
	...
    }

```


### Usage
To use the library, initialize it from your Activity

```
    // Kotlin
    val adapter = PagerAdapter(supportFragmentManager, this)

    // Java
    PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), this);

```

Add your fragments and titles to the adapter
```
    adapter.addFragment(FragmentOne(), "ONE")
    adapter.addFragment(FragmentTwo(), "TWO")
    adapter.addFragment(FragmentThree(), "THREE")
```

Alternatively you can add your fragments and titles as Arrays
```
    adapter.addAllFragments(FragmentOne(), FragmentTwo(), FragmentThree())
    adapter.addAllTitles("ONE", "TWO", "THREE")
```

To remove a fragment and it's title, call the remove function with the respective index
```
    adapter.removeFragment(1)
```

Set it to your ViewPager
```
    // Kotlin
    viewPager.adapter = adapter

    // Java
    viewPager.setAdapter(adapter)
```

### License
```
MIT License

Copyright (c) 2019 Vincent Tirgei

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```