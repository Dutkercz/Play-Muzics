package Dev2025.PlayMuzics;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class ChatBoot {
    private final ChatClient chatClient;

    public ChatBoot(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }
//
//    public String askChat (String aks){
//        return chatClient.prompt().user(aks).call().content();
//    }
//
//    public ChatClient getChatClient() {
//        return chatClient;
//    }
}
