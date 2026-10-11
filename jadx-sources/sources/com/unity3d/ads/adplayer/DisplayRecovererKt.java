package com.unity3d.ads.adplayer;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import com.unity3d.ads.adplayer.DisplayRecovererKt;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.v11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DisplayRecovererKt {
    public static final DisplayRecovererFactory displayRecovererFactory(final SessionRepository sessionRepository, final FocusRepository focusRepository, final SendDiagnosticEvent sendDiagnosticEvent, final Context context, final OrientationRepository orientationRepository) {
        sessionRepository.getClass();
        focusRepository.getClass();
        sendDiagnosticEvent.getClass();
        context.getClass();
        orientationRepository.getClass();
        return new DisplayRecovererFactory() { // from class: uh1
            @Override // com.unity3d.ads.adplayer.DisplayRecovererFactory
            public final DisplayRecoverer create(String str, AdObject adObject, AndroidShowOptions androidShowOptions, v11 v11Var) {
                DisplayRecoverer displayRecovererFactory$lambda$1;
                displayRecovererFactory$lambda$1 = DisplayRecovererKt.displayRecovererFactory$lambda$1(SessionRepository.this, focusRepository, sendDiagnosticEvent, context, orientationRepository, str, adObject, androidShowOptions, v11Var);
                return displayRecovererFactory$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayRecoverer displayRecovererFactory$lambda$1(SessionRepository sessionRepository, FocusRepository focusRepository, SendDiagnosticEvent sendDiagnosticEvent, Context context, OrientationRepository orientationRepository, String str, AdObject adObject, AndroidShowOptions androidShowOptions, v11 v11Var) {
        str.getClass();
        androidShowOptions.getClass();
        v11Var.getClass();
        if (!sessionRepository.getFeatureFlags().getRecoverFullscreenDisplayEnabled()) {
            return null;
        }
        DisplayRecoverer displayRecoverer = new DisplayRecoverer(str, adObject, sessionRepository, focusRepository, sendDiagnosticEvent, context, orientationRepository, androidShowOptions);
        displayRecoverer.start(v11Var);
        return displayRecoverer;
    }
}
