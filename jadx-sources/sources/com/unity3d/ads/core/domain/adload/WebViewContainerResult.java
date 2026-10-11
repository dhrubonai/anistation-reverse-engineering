package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.model.LoadEvent;
import defpackage.a34;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class WebViewContainerResult {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class FromPool extends WebViewContainerResult {
        private final AndroidWebViewContainer container;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromPool(AndroidWebViewContainer androidWebViewContainer) {
            super(null);
            androidWebViewContainer.getClass();
            this.container = androidWebViewContainer;
        }

        public static /* synthetic */ FromPool copy$default(FromPool fromPool, AndroidWebViewContainer androidWebViewContainer, int i, Object obj) {
            if ((i & 1) != 0) {
                androidWebViewContainer = fromPool.container;
            }
            return fromPool.copy(androidWebViewContainer);
        }

        public final AndroidWebViewContainer component1() {
            return this.container;
        }

        public final FromPool copy(AndroidWebViewContainer androidWebViewContainer) {
            androidWebViewContainer.getClass();
            return new FromPool(androidWebViewContainer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof FromPool) && a34.i(this.container, ((FromPool) obj).container)) {
                return true;
            }
            return false;
        }

        @Override // com.unity3d.ads.core.domain.adload.WebViewContainerResult
        public AndroidWebViewContainer getContainer() {
            return this.container;
        }

        public int hashCode() {
            return this.container.hashCode();
        }

        public String toString() {
            return "FromPool(container=" + this.container + ')';
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class FullyPreloaded extends WebViewContainerResult {
        private final AdPlayer adPlayer;
        private final WebViewBridge bridge;
        private final AndroidWebViewContainer container;
        private final LoadEvent loadEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullyPreloaded(AndroidWebViewContainer androidWebViewContainer, AdPlayer adPlayer, WebViewBridge webViewBridge, LoadEvent loadEvent) {
            super(null);
            androidWebViewContainer.getClass();
            adPlayer.getClass();
            webViewBridge.getClass();
            loadEvent.getClass();
            this.container = androidWebViewContainer;
            this.adPlayer = adPlayer;
            this.bridge = webViewBridge;
            this.loadEvent = loadEvent;
        }

        public static /* synthetic */ FullyPreloaded copy$default(FullyPreloaded fullyPreloaded, AndroidWebViewContainer androidWebViewContainer, AdPlayer adPlayer, WebViewBridge webViewBridge, LoadEvent loadEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                androidWebViewContainer = fullyPreloaded.container;
            }
            if ((i & 2) != 0) {
                adPlayer = fullyPreloaded.adPlayer;
            }
            if ((i & 4) != 0) {
                webViewBridge = fullyPreloaded.bridge;
            }
            if ((i & 8) != 0) {
                loadEvent = fullyPreloaded.loadEvent;
            }
            return fullyPreloaded.copy(androidWebViewContainer, adPlayer, webViewBridge, loadEvent);
        }

        public final AndroidWebViewContainer component1() {
            return this.container;
        }

        public final AdPlayer component2() {
            return this.adPlayer;
        }

        public final WebViewBridge component3() {
            return this.bridge;
        }

        public final LoadEvent component4() {
            return this.loadEvent;
        }

        public final FullyPreloaded copy(AndroidWebViewContainer androidWebViewContainer, AdPlayer adPlayer, WebViewBridge webViewBridge, LoadEvent loadEvent) {
            androidWebViewContainer.getClass();
            adPlayer.getClass();
            webViewBridge.getClass();
            loadEvent.getClass();
            return new FullyPreloaded(androidWebViewContainer, adPlayer, webViewBridge, loadEvent);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FullyPreloaded)) {
                return false;
            }
            FullyPreloaded fullyPreloaded = (FullyPreloaded) obj;
            if (a34.i(this.container, fullyPreloaded.container) && a34.i(this.adPlayer, fullyPreloaded.adPlayer) && a34.i(this.bridge, fullyPreloaded.bridge) && a34.i(this.loadEvent, fullyPreloaded.loadEvent)) {
                return true;
            }
            return false;
        }

        public final AdPlayer getAdPlayer() {
            return this.adPlayer;
        }

        public final WebViewBridge getBridge() {
            return this.bridge;
        }

        @Override // com.unity3d.ads.core.domain.adload.WebViewContainerResult
        public AndroidWebViewContainer getContainer() {
            return this.container;
        }

        public final LoadEvent getLoadEvent() {
            return this.loadEvent;
        }

        public int hashCode() {
            return this.loadEvent.hashCode() + ((this.bridge.hashCode() + ((this.adPlayer.hashCode() + (this.container.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "FullyPreloaded(container=" + this.container + ", adPlayer=" + this.adPlayer + ", bridge=" + this.bridge + ", loadEvent=" + this.loadEvent + ')';
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class OnDemand extends WebViewContainerResult {
        private final AndroidWebViewContainer container;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDemand(AndroidWebViewContainer androidWebViewContainer) {
            super(null);
            androidWebViewContainer.getClass();
            this.container = androidWebViewContainer;
        }

        public static /* synthetic */ OnDemand copy$default(OnDemand onDemand, AndroidWebViewContainer androidWebViewContainer, int i, Object obj) {
            if ((i & 1) != 0) {
                androidWebViewContainer = onDemand.container;
            }
            return onDemand.copy(androidWebViewContainer);
        }

        public final AndroidWebViewContainer component1() {
            return this.container;
        }

        public final OnDemand copy(AndroidWebViewContainer androidWebViewContainer) {
            androidWebViewContainer.getClass();
            return new OnDemand(androidWebViewContainer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof OnDemand) && a34.i(this.container, ((OnDemand) obj).container)) {
                return true;
            }
            return false;
        }

        @Override // com.unity3d.ads.core.domain.adload.WebViewContainerResult
        public AndroidWebViewContainer getContainer() {
            return this.container;
        }

        public int hashCode() {
            return this.container.hashCode();
        }

        public String toString() {
            return "OnDemand(container=" + this.container + ')';
        }
    }

    public /* synthetic */ WebViewContainerResult(q71 q71Var) {
        this();
    }

    public abstract AndroidWebViewContainer getContainer();

    private WebViewContainerResult() {
    }
}
