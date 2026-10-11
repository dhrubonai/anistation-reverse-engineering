package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ShowActivityResolverKt {
    public static final void commitExtras(Context context, Activity activity, ShowConfiguration showConfiguration) {
        Map<String, String> extras;
        if (context == null) {
            if (activity != null) {
                context = activity;
            } else {
                context = ClientProperties.getApplicationContext();
            }
        }
        if (context != null) {
            MetaData metaData = new MetaData(context);
            if (showConfiguration != null && (extras = showConfiguration.getExtras()) != null) {
                for (Map.Entry<String, String> entry : extras.entrySet()) {
                    metaData.set(entry.getKey(), entry.getValue());
                }
            }
            metaData.commit();
        }
    }

    public static final Activity resolveEffectiveActivity(Context context, Activity activity, AdObject adObject, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository) {
        Activity activity2;
        adObject.getClass();
        sendDiagnosticEvent.getClass();
        sessionRepository.getClass();
        if (context instanceof Activity) {
            activity2 = (Activity) context;
        } else {
            activity2 = null;
        }
        if (activity2 != null && !activity2.isDestroyed()) {
            if (activity != activity2) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_activity_mismatch", (Double) null, (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 238, (Object) null);
            }
            return activity2;
        }
        if (!sessionRepository.getNativeConfiguration().getFeatureFlags().getUseCurrentActivityForShow()) {
            return null;
        }
        if (activity == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_current_activity_null", (Double) null, (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 238, (Object) null);
        }
        return activity;
    }
}
