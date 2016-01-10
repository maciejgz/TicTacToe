package pl.mg.ttt.netty.server.discard;

/**
 * Created by m on 2016-01-06.
 */


public class DiscardServerHandler {
}

/*public class DiscardServerHandler extends ChannelHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ((ByteBuf) msg).release();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}*/
