package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class d extends BasePendingResult implements e {
    private final com.google.android.gms.common.api.i mApi;
    private final com.google.android.gms.common.api.c mClientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.o oVar) {
        super(oVar);
        if (oVar != null) {
            if (iVar != null) {
                this.mClientKey = iVar.f2367b;
                this.mApi = iVar;
                return;
            }
            throw new NullPointerException("Api must not be null");
        }
        throw new NullPointerException("GoogleApiClient must not be null");
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar);

    public final com.google.android.gms.common.api.i getApi() {
        return this.mApi;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.mClientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.s sVar) {
    }

    public final void run(com.google.android.gms.common.api.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e10) {
            setFailedResult(new Status(1, 8, e10.getLocalizedMessage(), null, null));
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(new Status(1, 8, e11.getLocalizedMessage(), null, null));
        }
    }

    public final void setFailedResult(Status status) {
        w7.b.i("Failed result must not be success", !status.d());
        com.google.android.gms.common.api.s createFailedResult = createFailedResult(status);
        setResult((d) createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}
