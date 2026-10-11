package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3007c;

    public /* synthetic */ a(String str, int i10, Object obj) {
        this.f3005a = i10;
        this.f3006b = str;
        this.f3007c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i10 = this.f3005a;
        String str = this.f3006b;
        Object obj = this.f3007c;
        switch (i10) {
            case 0:
                return LibraryVersionComponent.a(str, (LibraryVersionComponent.VersionExtractor) obj, componentContainer);
            default:
                return ComponentMonitor.a(str, (Component) obj, componentContainer);
        }
    }
}
