# Setup

1. Remove Global installation of react-native-cli (If any)

    ```bash
    npm uninstall -g react-native-cli #Let's install react-native-cli using npx
    ```

2. Initialize a React-Native Application using __npx__.

    ```bash
        # Note : HelloWorld is react-native-cli's default place holder
        # and hence shouldn't be used as a project name.
        npx react-native init HelloRN
        #✔ Downloading template
        #✔ Copying template
        #✔ Processing template
        #⠇ Installing dependencies
        #⠸ Installing CocoaPods dependencies (this may take a few minutes)
        # Analyzing dependencies
        # Fetching podspec for `DoubleConversion` from `../node_modules/react-native/third-party-podspecs/DoubleConversion.podspec`
        # Fetching podspec for `FBLazyVector` from `../node_modules/react-native/Libraries/FBLazyVector`
        # ...
        # [!] Error installing boost-for-react-native
        # Please try again manually: "cd ./HelloRN/ios && pod install".
        # Installing DoubleConversion (1.1.6)
        # Installing FBLazyVector (0.61.5)
        # ...
        # Installing glog (0.3.5)
        # ...
        # Generating Pods project
        # Integrating client project
        # Pod installation complete! There are 28 dependencies from the Podfile and 26 total pods installed.
    ```

3. Open the project in VSCode (Install `Prettier` and other Extensions needed)

4. Run android application using `npx`

    ```bash
    npx react-native run-android
    #info Starting JS server...
    #info Launching emulator...
    #info Successfully launched emulator.
    #info Installing the app...
    #info Connecting to the development server...
    #info Starting the app on "emulator-5554"...
    ```

5. Inspect `packages.json`

   ```json
    "dependencies": {
        "react": "16.9.0",
        "react-native": "0.61.5"
    }
   ```

    - `react` and `react-native` packages are base and needed.

    ```json
        "devDependencies": {
        "@babel/core": "^7.6.2",
        "@babel/runtime": "^7.6.2",
        "@react-native-community/eslint-config": "^0.0.5",
        "babel-jest": "^24.9.0",
        "eslint": "^6.5.1",
        "jest": "^24.9.0",
        "metro-react-native-babel-preset": "^0.56.0",
        "react-test-renderer": "16.9.0"
    }
    ```

    - Babel is used  to convert JSX(Javascript XML) into pure Javascript `(ReactDOM code)`.

6. Inspect `index.js`

    ```javascript
        import {AppRegistry} from 'react-native';
        import App from './App';
        import {name as appName} from './app.json';
    ```

    - `App.js` and `app.json` contain information about `App - component`.
    - `AppRegistry` from react-native
      - `AppRegistry` is the JS entry point to running all React Native apps.
      - App root components should register themselves with `AppRegistry.registerComponent`and native system will run the app when it's ready by invoking `AppRegistry.runApplication`.
      - To "stop" an application when a view should be destroyed, call`AppRegistry.unmountApplicationComponentAtRootTag` with the __tag__ that was passed to `runApplication`.

7. Inspect `App.js`

    ```javascript
        /**
         * @format
         * @flow
         */
        const App: () => React$Node = () => {
            return (<></>);
        };
    ```

    - `Flow` is a __static type-checker__ for Javascript. It can be configured using `.flowconfig`.
    - `App` is a __functional component__ that returns `React$Node`
      - ReactNode is one of `ReactChild | ReactFragment | ReactPortal | boolean | null | undefined`.