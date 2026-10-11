package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import p7.a0;

/* loaded from: classes.dex */
public class FirebaseExceptionMapper implements t {
    @Override // com.google.android.gms.common.api.internal.t
    public final Exception getException(Status status) {
        int i10 = status.f2361b;
        int i11 = status.f2361b;
        String str = status.f2362c;
        if (i10 == 8) {
            if (str == null) {
                str = a0.D(i11);
            }
            return new FirebaseException(str);
        }
        if (str == null) {
            str = a0.D(i11);
        }
        return new FirebaseApiNotAvailableException(str);
    }
}
