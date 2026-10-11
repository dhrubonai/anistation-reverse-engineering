package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.ai4;
import defpackage.vn3;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        getGameId.getClass();
        sendDiagnosticEvent.getClass();
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z) {
        if (!z) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, (Double) null, map, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z) {
        String invoke = this.getGameId.invoke();
        if (invoke == null) {
            invoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> T = vn3.T(new ai4("previous_game_id", previousGameId), new ai4("game_id", invoke));
        if (!previousGameId.equals("null")) {
            if (!invoke.equals(previousGameId)) {
                sendDiagnostic("native_initialize_game_id_changed", T, z);
            } else {
                sendDiagnostic("native_initialize_game_id_same", T, z);
            }
            boolean isTestMode = SdkProperties.isTestMode();
            boolean previousTestMode = SdkProperties.getPreviousTestMode();
            Map<String, String> T2 = vn3.T(new ai4("previous_test_mode", String.valueOf(previousTestMode)), new ai4("test_mode", String.valueOf(isTestMode)));
            if (isTestMode != previousTestMode) {
                sendDiagnostic("native_initialize_test_mode_changed", T2, z);
            } else {
                sendDiagnostic("native_initialize_test_mode_same", T2, z);
            }
        }
    }
}
