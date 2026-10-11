package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2964c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f2962a = i10;
        this.f2964c = obj;
        this.f2963b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2962a;
        Object obj = this.f2963b;
        Object obj2 = this.f2964c;
        switch (i10) {
            case 0:
                ((OptionalProvider) obj2).set((Provider) obj);
                return;
            case 1:
                ((LazySet) obj2).add((Provider) obj);
                return;
            default:
                EventBus.lambda$publish$0((Map.Entry) obj2, (Event) obj);
                return;
        }
    }
}
