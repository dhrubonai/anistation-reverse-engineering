package com.google.firebase.ktx;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import java.lang.annotation.Annotation;
import p7.w;
import r6.h0;

/* loaded from: classes.dex */
public final class FirebaseKt {
    public static final FirebaseApp app(Firebase firebase, String str) {
        h0.u(firebase, "<this>");
        h0.u(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        h0.s(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<w> coroutineDispatcher() {
        h0.W0();
        throw null;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        h0.u(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        h0.s(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        h0.u(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        h0.s(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        h0.u(firebase, "<this>");
        h0.u(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        h0.u(firebase, "<this>");
        h0.u(context, "context");
        h0.u(firebaseOptions, "options");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        h0.s(initializeApp, "initializeApp(context, options)");
        return initializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        h0.u(firebase, "<this>");
        h0.u(context, "context");
        h0.u(firebaseOptions, "options");
        h0.u(str, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        h0.s(initializeApp, "initializeApp(context, options, name)");
        return initializeApp;
    }
}
