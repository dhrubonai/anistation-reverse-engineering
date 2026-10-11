package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import t4.b;
import v4.a;

/* loaded from: classes.dex */
public final class zbl {
    public final q delete(o oVar, Credential credential) {
        if (oVar != null) {
            if (credential != null) {
                return oVar.a(new zbi(this, oVar, credential));
            }
            throw new NullPointerException("credential must not be null");
        }
        throw new NullPointerException("client must not be null");
    }

    public final q disableAutoSignIn(o oVar) {
        if (oVar != null) {
            return oVar.a(new zbj(this, oVar));
        }
        throw new NullPointerException("client must not be null");
    }

    public final PendingIntent getHintPickerIntent(o oVar, HintRequest hintRequest) {
        if (oVar != null) {
            if (hintRequest != null) {
                i iVar = b.f10029a;
                throw new UnsupportedOperationException();
            }
            throw new NullPointerException("request must not be null");
        }
        throw new NullPointerException("client must not be null");
    }

    public final q request(o oVar, a aVar) {
        if (oVar != null) {
            if (aVar != null) {
                return ((j0) oVar).f2437b.doRead((l) new zbg(this, oVar, aVar));
            }
            throw new NullPointerException("request must not be null");
        }
        throw new NullPointerException("client must not be null");
    }

    public final q save(o oVar, Credential credential) {
        if (oVar != null) {
            if (credential != null) {
                return oVar.a(new zbh(this, oVar, credential));
            }
            throw new NullPointerException("credential must not be null");
        }
        throw new NullPointerException("client must not be null");
    }
}
