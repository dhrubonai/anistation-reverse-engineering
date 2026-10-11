package com.google.firebase;

import android.content.Context;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2956a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2958c;

    public /* synthetic */ a(Context context, String str) {
        this.f2957b = context;
        this.f2958c = str;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        HeartBeatInfoStorage lambda$new$2;
        int i10 = this.f2956a;
        Context context = this.f2957b;
        Object obj = this.f2958c;
        switch (i10) {
            case 0:
                return FirebaseApp.b((FirebaseApp) obj, context);
            default:
                lambda$new$2 = DefaultHeartBeatController.lambda$new$2(context, (String) obj);
                return lambda$new$2;
        }
    }

    public /* synthetic */ a(FirebaseApp firebaseApp, Context context) {
        this.f2958c = firebaseApp;
        this.f2957b = context;
    }
}
