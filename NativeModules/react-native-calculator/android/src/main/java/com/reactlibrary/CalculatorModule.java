package com.reactlibrary;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class CalculatorModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public CalculatorModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Calculator";
    }

    @ReactMethod
    public void pingCallback(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }

    public void pingPromise(String stringArgument, int numberArgument, Promise promise) {
        // TODO: Implement some actually useful functionality
        promise.resolve("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }
}
