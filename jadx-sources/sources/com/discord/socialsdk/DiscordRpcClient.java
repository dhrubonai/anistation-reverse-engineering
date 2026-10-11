package com.discord.socialsdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.discord.socialsdk.rpc.IDiscordRpcCallback;
import com.discord.socialsdk.rpc.IDiscordRpcConnection;
import com.discord.socialsdk.rpc.IDiscordRpcService;
import defpackage.fw;
import defpackage.gb;
import defpackage.p0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class DiscordRpcClient {
    private static final int CLOSE_ABNORMAL = 1006;
    private static final String[] DISCORD_PACKAGES = {"com.discord"};
    private static final int INVALID_CLIENTID = 4000;
    private static final String RPC_SERVICE_ACTION = "com.discord.socialsdk.rpc.IDiscordRpcService";
    private static final String RPC_VERSION = "1";
    private static final String TAG = "DiscordSocialSdk";
    private final long nativeContext;
    private IDiscordRpcConnection rpcConnection;
    private IDiscordRpcService service;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private boolean bound = false;
    private long pendingApplicationId = 0;
    private final IDiscordRpcCallback.Stub callback = new IDiscordRpcCallback.Stub() { // from class: com.discord.socialsdk.DiscordRpcClient.1
        public AnonymousClass1() {
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
        public void onClose(int i, String str) {
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnClose(discordRpcClient.nativeContext, i, str);
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
        public void onFrame(String str) {
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnFrame(discordRpcClient.nativeContext, str);
        }
    };
    private final ServiceConnection connection = new ServiceConnection() { // from class: com.discord.socialsdk.DiscordRpcClient.2
        public AnonymousClass2() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DiscordRpcClient.this.service = IDiscordRpcService.Stub.asInterface(iBinder);
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnConnected(discordRpcClient.nativeContext);
            try {
                DiscordRpcClient discordRpcClient2 = DiscordRpcClient.this;
                discordRpcClient2.rpcConnection = discordRpcClient2.service.connect(DiscordRpcClient.this.pendingApplicationId, "1", DiscordRpcClient.this.callback);
                if (DiscordRpcClient.this.rpcConnection == null) {
                    DiscordRpcClient discordRpcClient3 = DiscordRpcClient.this;
                    discordRpcClient3.nativeOnClose(discordRpcClient3.nativeContext, DiscordRpcClient.CLOSE_ABNORMAL, "handshake rejected");
                }
            } catch (RemoteException e) {
                Log.e(DiscordRpcClient.TAG, "Failed to handshake with Discord RPC service", e);
                DiscordRpcClient discordRpcClient4 = DiscordRpcClient.this;
                discordRpcClient4.nativeOnClose(discordRpcClient4.nativeContext, DiscordRpcClient.CLOSE_ABNORMAL, "handshake failed");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DiscordRpcClient.this.service = null;
            DiscordRpcClient.this.rpcConnection = null;
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnClose(discordRpcClient.nativeContext, DiscordRpcClient.CLOSE_ABNORMAL, "service disconnected");
        }
    };

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.discord.socialsdk.DiscordRpcClient$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends IDiscordRpcCallback.Stub {
        public AnonymousClass1() {
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
        public void onClose(int i, String str) {
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnClose(discordRpcClient.nativeContext, i, str);
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
        public void onFrame(String str) {
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnFrame(discordRpcClient.nativeContext, str);
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.discord.socialsdk.DiscordRpcClient$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements ServiceConnection {
        public AnonymousClass2() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DiscordRpcClient.this.service = IDiscordRpcService.Stub.asInterface(iBinder);
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnConnected(discordRpcClient.nativeContext);
            try {
                DiscordRpcClient discordRpcClient2 = DiscordRpcClient.this;
                discordRpcClient2.rpcConnection = discordRpcClient2.service.connect(DiscordRpcClient.this.pendingApplicationId, "1", DiscordRpcClient.this.callback);
                if (DiscordRpcClient.this.rpcConnection == null) {
                    DiscordRpcClient discordRpcClient3 = DiscordRpcClient.this;
                    discordRpcClient3.nativeOnClose(discordRpcClient3.nativeContext, DiscordRpcClient.CLOSE_ABNORMAL, "handshake rejected");
                }
            } catch (RemoteException e) {
                Log.e(DiscordRpcClient.TAG, "Failed to handshake with Discord RPC service", e);
                DiscordRpcClient discordRpcClient4 = DiscordRpcClient.this;
                discordRpcClient4.nativeOnClose(discordRpcClient4.nativeContext, DiscordRpcClient.CLOSE_ABNORMAL, "handshake failed");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DiscordRpcClient.this.service = null;
            DiscordRpcClient.this.rpcConnection = null;
            DiscordRpcClient discordRpcClient = DiscordRpcClient.this;
            discordRpcClient.nativeOnClose(discordRpcClient.nativeContext, DiscordRpcClient.CLOSE_ABNORMAL, "service disconnected");
        }
    }

    public DiscordRpcClient(long j) {
        this.nativeContext = j;
    }

    public static /* synthetic */ void a(DiscordRpcClient discordRpcClient, String str) {
        discordRpcClient.lambda$sendFrame$1(str);
    }

    public static /* synthetic */ void c(DiscordRpcClient discordRpcClient) {
        discordRpcClient.lambda$disconnect$2();
    }

    public /* synthetic */ void lambda$connect$0(long j) {
        this.pendingApplicationId = j;
        Activity engineActivity = DiscordSocialSdkInit.getEngineActivity();
        Intent resolveServiceIntent = resolveServiceIntent(engineActivity);
        if (resolveServiceIntent == null) {
            nativeOnClose(this.nativeContext, INVALID_CLIENTID, "Discord client not installed");
            return;
        }
        try {
            boolean bindService = engineActivity.bindService(resolveServiceIntent, this.connection, 1);
            this.bound = bindService;
            if (!bindService) {
                nativeOnClose(this.nativeContext, CLOSE_ABNORMAL, "bindService returned false");
            }
        } catch (SecurityException e) {
            Log.e(TAG, "bindService denied", e);
            nativeOnClose(this.nativeContext, CLOSE_ABNORMAL, "bindService denied");
        }
    }

    public /* synthetic */ void lambda$disconnect$2() {
        IDiscordRpcConnection iDiscordRpcConnection = this.rpcConnection;
        if (iDiscordRpcConnection != null) {
            try {
                iDiscordRpcConnection.disconnect();
            } catch (RemoteException unused) {
            }
        }
        if (this.bound) {
            try {
                DiscordSocialSdkInit.getEngineActivity().unbindService(this.connection);
            } catch (IllegalArgumentException unused2) {
            }
            this.bound = false;
        }
        this.rpcConnection = null;
        this.service = null;
    }

    public /* synthetic */ void lambda$sendFrame$1(String str) {
        IDiscordRpcConnection iDiscordRpcConnection = this.rpcConnection;
        if (iDiscordRpcConnection == null) {
            return;
        }
        try {
            iDiscordRpcConnection.sendFrame(str);
        } catch (RemoteException e) {
            Log.e(TAG, "sendFrame failed", e);
        }
    }

    public native void nativeOnClose(long j, int i, String str);

    public native void nativeOnConnected(long j);

    public native void nativeOnFrame(long j, String str);

    private Intent resolveServiceIntent(Context context) {
        for (String str : DISCORD_PACKAGES) {
            Intent intent = new Intent("com.discord.socialsdk.rpc.IDiscordRpcService").setPackage(str);
            if (context.getPackageManager().resolveService(intent, 0) != null) {
                return intent;
            }
        }
        return null;
    }

    public void connect(long j) {
        this.mainHandler.post(new fw(this, j, (byte) 1));
    }

    public void disconnect() {
        this.mainHandler.post(new p0((Object) this, (byte) 19));
    }

    public void finalize() {
        nativeFinalize(this.nativeContext);
    }

    public native void nativeFinalize(long j);

    public void sendFrame(String str) {
        this.mainHandler.post(new gb(this, str, (byte) 22));
    }
}
