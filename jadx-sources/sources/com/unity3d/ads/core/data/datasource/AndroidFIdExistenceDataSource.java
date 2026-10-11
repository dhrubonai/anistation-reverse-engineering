package com.unity3d.ads.core.data.datasource;

import defpackage.y45;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {
    private final String className;

    public AndroidFIdExistenceDataSource(String str) {
        str.getClass();
        this.className = str;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object y45Var;
        try {
            y45Var = Class.forName(this.className);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        return !(y45Var instanceof y45);
    }
}
