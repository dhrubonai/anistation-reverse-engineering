package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import defpackage.jh4;
import defpackage.k21;
import defpackage.kx2;
import defpackage.ze0;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final k21 getCreativeType(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("creativeType");
        if (optInt != 1) {
            if (optInt != 2) {
                if (optInt != 3) {
                    if (optInt != 4) {
                        if (optInt == 5) {
                            return k21.AUDIO;
                        }
                        ze0.k("Invalid creativeType");
                        return null;
                    }
                    return k21.VIDEO;
                }
                return k21.NATIVE_DISPLAY;
            }
            return k21.HTML_DISPLAY;
        }
        return k21.DEFINED_BY_JAVASCRIPT;
    }

    private final kx2 getImpressionType(JSONObject jSONObject) {
        switch (jSONObject.optInt("impressionType")) {
            case 1:
                return kx2.DEFINED_BY_JAVASCRIPT;
            case 2:
                return kx2.UNSPECIFIED;
            case 3:
                return kx2.LOADED;
            case 4:
                return kx2.BEGIN_TO_RENDER;
            case 5:
                return kx2.ONE_PIXEL;
            case 6:
                return kx2.VIEWABLE;
            case 7:
                return kx2.AUDIBLE;
            case 8:
                return kx2.OTHER;
            default:
                ze0.k("Invalid impressionType");
                return null;
        }
    }

    private final jh4 getImpressionsOwner(JSONObject jSONObject) {
        jh4 jh4Var = jh4.NONE;
        try {
            int optInt = jSONObject.optInt("impressionOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return jh4Var;
                    }
                    throw new IllegalArgumentException("Invalid impressionOwner");
                }
                return jh4.NATIVE;
            }
            return jh4.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return jh4Var;
        }
    }

    private final jh4 getMediaEventsOwner(JSONObject jSONObject) {
        jh4 jh4Var = jh4.NONE;
        try {
            int optInt = jSONObject.optInt("mediaEventsOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return jh4Var;
                    }
                    throw new IllegalArgumentException("Invalid mediaEventsOwner");
                }
                return jh4.NATIVE;
            }
            return jh4.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return jh4Var;
        }
    }

    private final jh4 getVideoEventsOwner(JSONObject jSONObject) {
        jh4 jh4Var = jh4.NONE;
        try {
            int optInt = jSONObject.optInt("videoEventsOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return jh4Var;
                    }
                    throw new IllegalArgumentException("Invalid videoEventsOwner");
                }
                return jh4.NATIVE;
            }
            return jh4.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return jh4Var;
        }
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public OmidOptions getOMidOptions(JSONObject jSONObject) {
        jSONObject.getClass();
        return new OmidOptions(jSONObject.optBoolean("isolateVerificationScripts"), getImpressionsOwner(jSONObject), getVideoEventsOwner(jSONObject), jSONObject.optString("customReferenceData"), getImpressionType(jSONObject), getCreativeType(jSONObject), getMediaEventsOwner(jSONObject));
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public WebView getWebview(AdObject adObject) {
        WebViewContainer webViewContainer;
        adObject.getClass();
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (webViewContainer = adPlayer.getWebViewContainer()) != null) {
            return webViewContainer.getWebView();
        }
        return null;
    }
}
