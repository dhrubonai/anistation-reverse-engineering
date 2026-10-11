.class public final synthetic Lcom/google/firebase/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/inject/Provider;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/a;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/firebase/FirebaseApp;Landroid/content/Context;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/firebase/a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/firebase/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/firebase/a;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    check-cast v2, Lcom/google/firebase/FirebaseApp;

    invoke-static {v2, v1}, Lcom/google/firebase/FirebaseApp;->b(Lcom/google/firebase/FirebaseApp;Landroid/content/Context;)Lcom/google/firebase/internal/DataCollectionConfigStorage;

    move-result-object v0

    return-object v0

    :goto_0
    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/firebase/heartbeatinfo/DefaultHeartBeatController;->c(Landroid/content/Context;Ljava/lang/String;)Lcom/google/firebase/heartbeatinfo/HeartBeatInfoStorage;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
