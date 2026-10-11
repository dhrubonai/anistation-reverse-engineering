package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.webkit.WebView;
import defpackage.q71;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class DisplayMessage {
    private final String opportunityId;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DisplayDestroyed extends DisplayMessage {
        private final boolean finishedBySdk;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(String str, boolean z) {
            super(str, null);
            str.getClass();
            this.finishedBySdk = z;
        }

        public final boolean getFinishedBySdk() {
            return this.finishedBySdk;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(String str, String str2) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.reason = str2;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(String str) {
            super(str, null);
            str.getClass();
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DisplayStarted extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayStarted(String str) {
            super(str, null);
            str.getClass();
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(String str, boolean z) {
            super(str, null);
            str.getClass();
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class OpenUrl extends DisplayMessage {
        private final Intent intent;
        private final boolean useActivityForResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(String str, Intent intent, boolean z) {
            super(str, null);
            str.getClass();
            intent.getClass();
            this.intent = intent;
            this.useActivityForResult = z;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final boolean getUseActivityForResult() {
            return this.useActivityForResult;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class OpenUrlResult extends DisplayMessage {
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlResult(String str, boolean z) {
            super(str, null);
            str.getClass();
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(String str, int i) {
            super(str, null);
            str.getClass();
            this.orientation = i;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(String str, boolean z) {
            super(str, null);
            str.getClass();
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(String str) {
            super(str, null);
            str.getClass();
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(String str, WebView webView) {
            super(str, null);
            str.getClass();
            webView.getClass();
            this.webView = webView;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    public /* synthetic */ DisplayMessage(String str, q71 q71Var) {
        this(str);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DisplayReady extends DisplayMessage {
        private final boolean isRecoveryReattach;
        private final Map<String, Object> showOptions;

        public /* synthetic */ DisplayReady(String str, Map map, boolean z, int i, q71 q71Var) {
            this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? false : z);
        }

        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        public final boolean isRecoveryReattach() {
            return this.isRecoveryReattach;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(String str, Map<String, ? extends Object> map, boolean z) {
            super(str, null);
            str.getClass();
            this.showOptions = map;
            this.isRecoveryReattach = z;
        }
    }
}
