package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ai4;
import defpackage.el5;
import defpackage.g6;
import defpackage.hj4;
import defpackage.n11;
import defpackage.ot1;
import defpackage.sx5;
import defpackage.tl7;
import defpackage.tt1;
import defpackage.tx5;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.x44;
import defpackage.ze0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final x44 _isOMActive;
    private final x44 activeSessions;
    private final x44 finishedSessions;
    private final n11 mainDispatcher;
    private final OmidManager omidManager;
    private final hj4 partner;

    /* JADX WARN: Type inference failed for: r1v5, types: [hj4, java.lang.Object] */
    public AndroidOpenMeasurementRepository(n11 n11Var, OmidManager omidManager) {
        n11Var.getClass();
        omidManager.getClass();
        this.mainDispatcher = n11Var;
        this.omidManager = omidManager;
        if (!TextUtils.isEmpty(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME)) {
            if (!TextUtils.isEmpty("4.21.0")) {
                this.partner = new Object();
                this.activeSessions = tx5.a(ot1.x);
                this.finishedSessions = tx5.a(tt1.x);
                this._isOMActive = tx5.a(Boolean.FALSE);
                return;
            }
            ze0.k("Version is null or empty");
            throw null;
        }
        ze0.k("Name is null or empty");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, g6 g6Var) {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this.activeSessions;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, vn3.W((Map) value, new ai4(byteString.toStringUtf8(), g6Var))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g6 getSession(ByteString byteString) {
        return (g6) ((Map) ((sx5) this.activeSessions).getValue()).get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        sx5 sx5Var;
        Object value;
        Map map;
        x44 x44Var = this.activeSessions;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            Map map2 = (Map) value;
            String stringUtf8 = byteString.toStringUtf8();
            map2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.remove(stringUtf8);
            int size = linkedHashMap.size();
            if (size != 0) {
                map = linkedHashMap;
                if (size == 1) {
                    Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                    Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                    singletonMap.getClass();
                    map = singletonMap;
                }
            } else {
                map = ot1.x;
            }
        } while (!sx5Var.j(value, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this.finishedSessions;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, el5.W((Set) value, byteString.toStringUtf8())));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, vz0 vz0Var) {
        return tl7.V(this.mainDispatcher, new AndroidOpenMeasurementRepository$activateOM$2(this, context, null), vz0Var);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, vz0 vz0Var) {
        return tl7.V(this.mainDispatcher, new AndroidOpenMeasurementRepository$finishSession$2(this, byteString, null), vz0Var);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString byteString) {
        byteString.getClass();
        return ((Set) ((sx5) this.finishedSessions).getValue()).contains(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z, vz0 vz0Var) {
        return tl7.V(this.mainDispatcher, new AndroidOpenMeasurementRepository$impressionOccurred$2(this, byteString, z, null), vz0Var);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return ((Boolean) ((sx5) this._isOMActive).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this._isOMActive;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            ((Boolean) value).getClass();
        } while (!sx5Var.j(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, vz0 vz0Var) {
        return tl7.V(this.mainDispatcher, new AndroidOpenMeasurementRepository$startSession$2(this, byteString, omidOptions, webView, null), vz0Var);
    }
}
