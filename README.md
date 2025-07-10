# BackgroundSyncDemo

A minimalist **Kotlin Multiplatform (KMP)** demo showcasing how to run **background sync tasks** using **WorkManager** on Android and **BGTaskScheduler** on iOS.

> ⚙️ Part of the [KMP Bits](https://www.kmpbits.com) series — hands-on examples for real-world KMP development.

---

## ✨ Features

- ✅ **WorkManager Integration**: Schedule periodic tasks on Android with constraints.
- 🍏 **BGTaskScheduler Setup**: Register and handle background tasks on iOS.
- 🔗 **Shared API**: Use KMP `expect/actual` to bridge background work logic.
- 🧩 **Minimal Example**: Easy to fork, run, and adapt to your app.

---

## 🚀 Getting Started

### Prerequisites

- **Android Studio**: Giraffe or newer.
- **Xcode**: Latest stable version for iOS build.
- **Kotlin**: 1.9 or newer.

### Running the Demo

1️⃣ **Clone the repository**:

```bash
git clone https://github.com/kmpbits/backgroundSyncDemo.git
cd backgroundSyncDemo
```

2️⃣ **Open in Android Studio**  
Open the project and let Gradle sync.

3️⃣ **Run on Android**  
Select the `androidApp` configuration and click **Run**. Check **Logcat** to see periodic logs every ~15 minutes (depending on system conditions).

4️⃣ **Run on iOS**  
Open the `iosApp` module in **Xcode**, choose a device (real device recommended for background tasks), and click **Run**. Watch the console for task logs.

---

## 🧩 Project Structure

```
backgroundSyncDemo/
├── androidApp/         # Android-specific WorkManager code
├── iosApp/             # iOS-specific BGTaskScheduler code
├── composeApp/         # Shared KMP code with expect/actual declarations
├── build.gradle.kts    # Root Gradle build file
├── settings.gradle.kts # Project settings
└── README.md
```

---

## 💡 Concepts Covered

- How to use **WorkManager** to schedule reliable periodic work on Android.
- How to use **BGTaskScheduler** to refresh app data in the background on iOS.
- How to bridge platform-specific background work with **KMP expect/actual**.
- Testing and best practices for cross-platform background tasks.

---

## 📚 Learn More

- 📖 [Read the full article on KMP Bits](https://www.kmpbits.com/background-sync-kmp)
- 📑 [WorkManager Official Docs](https://developer.android.com/topic/libraries/architecture/workmanager)
- 📑 [BGTaskScheduler Official Docs](https://developer.apple.com/documentation/backgroundtasks)
- 💡 [More KMP Bits Projects](https://www.kmpbits.com)

---

**Originally published on [KMP Bits](https://www.kmpbits.com)** 🚀
