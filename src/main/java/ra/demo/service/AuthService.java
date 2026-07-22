package ra.demo.service;

import ra.demo.dto.request.RegisterRequest;
import ra.demo.entity.User;

public interface AuthService {
    User register(RegisterRequest request);
}