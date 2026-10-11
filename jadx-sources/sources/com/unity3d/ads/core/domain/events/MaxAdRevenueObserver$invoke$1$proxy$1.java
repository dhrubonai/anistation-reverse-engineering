package com.unity3d.ads.core.domain.events;

import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import defpackage.a34;
import defpackage.ec2;
import defpackage.rc2;
import defpackage.tc2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public /* synthetic */ class MaxAdRevenueObserver$invoke$1$proxy$1 implements CommunicatorSubscriberProxy.CommunicatorMessageListener, rc2 {
    final /* synthetic */ MaxAdRevenueListener $tmp0;

    public MaxAdRevenueObserver$invoke$1$proxy$1(MaxAdRevenueListener maxAdRevenueListener) {
        this.$tmp0 = maxAdRevenueListener;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CommunicatorSubscriberProxy.CommunicatorMessageListener) || !(obj instanceof rc2)) {
            return false;
        }
        return a34.i(getFunctionDelegate(), ((rc2) obj).getFunctionDelegate());
    }

    @Override // defpackage.rc2
    public final ec2 getFunctionDelegate() {
        return new tc2(1, this.$tmp0, MaxAdRevenueListener.class, "onMessageReceived", "onMessageReceived(Landroid/os/Bundle;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.unity3d.services.core.reflection.CommunicatorSubscriberProxy.CommunicatorMessageListener
    public final void onMessageReceived(Bundle bundle) {
        bundle.getClass();
        this.$tmp0.onMessageReceived(bundle);
    }
}
