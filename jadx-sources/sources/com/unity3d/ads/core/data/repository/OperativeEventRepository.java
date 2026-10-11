package com.unity3d.ads.core.data.repository;

import defpackage.fn5;
import defpackage.h41;
import defpackage.in5;
import defpackage.jn5;
import defpackage.t44;
import defpackage.ta0;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OperativeEventRepository {
    private final t44 _operativeEvents;
    private final fn5 operativeEvents;

    public OperativeEventRepository() {
        in5 a = jn5.a(10, 10, ta0.y);
        this._operativeEvents = a;
        this.operativeEvents = h41.c(a);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        operativeEventRequest.getClass();
        this._operativeEvents.d(operativeEventRequest);
    }

    public final fn5 getOperativeEvents() {
        return this.operativeEvents;
    }
}
