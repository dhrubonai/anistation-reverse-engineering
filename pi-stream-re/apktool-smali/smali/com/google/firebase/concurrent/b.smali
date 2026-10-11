.class public final synthetic Lcom/google/firebase/concurrent/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Resolver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

.field public final synthetic c:J

.field public final synthetic d:Ljava/util/concurrent/TimeUnit;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;I)V
    .locals 0

    .line 1
    iput p6, p0, Lcom/google/firebase/concurrent/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/firebase/concurrent/b;->b:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/google/firebase/concurrent/b;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iput-wide p3, p0, Lcom/google/firebase/concurrent/b;->c:J

    .line 8
    .line 9
    iput-object p5, p0, Lcom/google/firebase/concurrent/b;->d:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final addCompleter(Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    .line 1
    iget v0, p0, Lcom/google/firebase/concurrent/b;->a:I

    iget-object v1, p0, Lcom/google/firebase/concurrent/b;->e:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v2, p0, Lcom/google/firebase/concurrent/b;->b:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

    move-object v3, v1

    check-cast v3, Ljava/util/concurrent/Callable;

    iget-wide v4, p0, Lcom/google/firebase/concurrent/b;->c:J

    iget-object v6, p0, Lcom/google/firebase/concurrent/b;->d:Ljava/util/concurrent/TimeUnit;

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->g(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1

    :goto_0
    iget-object v0, p0, Lcom/google/firebase/concurrent/b;->b:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

    check-cast v1, Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/google/firebase/concurrent/b;->c:J

    iget-object v4, p0, Lcom/google/firebase/concurrent/b;->d:Ljava/util/concurrent/TimeUnit;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->a(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
